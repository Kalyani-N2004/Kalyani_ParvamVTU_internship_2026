/* =========================
   GLOBAL VARIABLES
========================= */

let editExpenseId = null;
let editIncomeId = null;
let currentBudgetValue = 0;

let financeChart = null; // ⭐ chart instance

/* =========================
   INIT APP
========================= */

function initApp() {
    getExpenses();
    getIncome();
    loadDashboard();
    loadBudget();
}

/* =========================
   EXPENSE MODULE
========================= */

function getExpenses() {

    fetch("http://localhost:8080/expense/all")
        .then(res => res.json())
        .then(data => {

            let rows = "";
            let totalExpense = 0;

            data.forEach(exp => {
                totalExpense += parseFloat(exp.amount);

                rows += `
                    <tr>
                        <td>${exp.id}</td>
                        <td>${exp.title}</td>
                        <td>${exp.amount}</td>
                        <td>${exp.category}</td>
                        <td>${exp.date}</td>
                        <td>
                            <button class="btn btn-warning btn-sm"
                                onclick='editExpense(${JSON.stringify(exp)})'>Edit</button>

                            <button class="btn btn-danger btn-sm"
                                onclick="deleteExpense(${exp.id})">Delete</button>
                        </td>
                    </tr>
                `;
            });

            document.getElementById("expenseTable").innerHTML = rows;

            document.getElementById("totalExpense").innerText = totalExpense;

            updateChart(); // ⭐ update chart
            checkBudget();
        });
}

function saveExpense() {

    const expense = {
        title: document.getElementById("title").value,
        amount: parseFloat(document.getElementById("amount").value || 0),
        category: document.getElementById("category").value,
        date: document.getElementById("date").value
    };

    let url = editExpenseId
        ? `http://localhost:8080/expense/update/${editExpenseId}`
        : "http://localhost:8080/expense/add";

    let method = editExpenseId ? "PUT" : "POST";

    fetch(url, {
        method: method,
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(expense)
    }).then(() => {
        clearExpenseForm();
        editExpenseId = null;
        refreshAll();
    });
}

function editExpense(exp) {
    document.getElementById("title").value = exp.title;
    document.getElementById("amount").value = exp.amount;
    document.getElementById("category").value = exp.category;
    document.getElementById("date").value = exp.date;

    editExpenseId = exp.id;
}

function deleteExpense(id) {
    fetch(`http://localhost:8080/expense/delete/${id}`, {
        method: "DELETE"
    }).then(() => refreshAll());
}

function clearExpenseForm() {
    document.getElementById("title").value = "";
    document.getElementById("amount").value = "";
    document.getElementById("category").value = "";
    document.getElementById("date").value = "";
}

/* =========================
   INCOME MODULE
========================= */

function getIncome() {

    fetch("http://localhost:8080/income/all")
        .then(res => res.json())
        .then(data => {

            let rows = "";
            let totalIncome = 0;

            data.forEach(inc => {
                totalIncome += parseFloat(inc.amount);

                rows += `
                    <tr>
                        <td>${inc.id}</td>
                        <td>${inc.source}</td>
                        <td>${inc.amount}</td>
                        <td>${inc.date}</td>
                        <td>
                            <button class="btn btn-warning btn-sm"
                                onclick='editIncome(${JSON.stringify(inc)})'>Edit</button>

                            <button class="btn btn-danger btn-sm"
                                onclick="deleteIncome(${inc.id})">Delete</button>
                        </td>
                    </tr>
                `;
            });

            document.getElementById("incomeTable").innerHTML = rows;

            document.getElementById("totalIncome").innerText = totalIncome;

            updateChart(); // ⭐ update chart
            checkBudget();
        });
}

function saveIncome() {

    const income = {
        source: document.getElementById("source").value,
        amount: parseFloat(document.getElementById("incomeAmount").value || 0),
        date: document.getElementById("incomeDate").value
    };

    let url = editIncomeId
        ? `http://localhost:8080/income/update/${editIncomeId}`
        : "http://localhost:8080/income/add";

    let method = editIncomeId ? "PUT" : "POST";

    fetch(url, {
        method: method,
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(income)
    }).then(() => {
        clearIncomeForm();
        editIncomeId = null;
        refreshAll();
    });
}

function editIncome(inc) {
    document.getElementById("source").value = inc.source;
    document.getElementById("incomeAmount").value = inc.amount;
    document.getElementById("incomeDate").value = inc.date;

    editIncomeId = inc.id;
}

function deleteIncome(id) {
    fetch(`http://localhost:8080/income/delete/${id}`, {
        method: "DELETE"
    }).then(() => refreshAll());
}

function clearIncomeForm() {
    document.getElementById("source").value = "";
    document.getElementById("incomeAmount").value = "";
    document.getElementById("incomeDate").value = "";
}

/* =========================
   DASHBOARD MODULE
========================= */

function loadDashboard() {

    fetch("http://localhost:8080/dashboard/summary")
        .then(res => res.json())
        .then(data => {

            document.getElementById("totalIncome").innerText = data.totalIncome || 0;
            document.getElementById("totalExpense").innerText = data.totalExpense || 0;
            document.getElementById("balance").innerText = data.balance || 0;

            updateChart();
            checkBudget();
        });
}

/* =========================
   BUDGET MODULE
========================= */

function saveBudget() {

    const budget = {
        monthlyBudget: parseFloat(document.getElementById("budgetAmount").value || 0)
    };

    fetch("http://localhost:8080/budget/set", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(budget)
    }).then(() => loadBudget());
}

function loadBudget() {

    fetch("http://localhost:8080/budget/get")
        .then(res => res.json())
        .then(data => {

            if (data) {
                currentBudgetValue = data.monthlyBudget || 0;
                document.getElementById("currentBudget").innerText = currentBudgetValue;
            }

            checkBudget();
        });
}

/* =========================
   🚨 BUDGET ALERT
========================= */

let alertShown = false;

function checkBudget() {

    let expense = parseFloat(document.getElementById("totalExpense").innerText || 0);

    if (currentBudgetValue > 0 && expense > currentBudgetValue) {

        if (!alertShown) {
            alert("⚠ WARNING: You have exceeded your monthly budget!");
            alertShown = true;
        }

    } else {
        alertShown = false;
    }
}

/* =========================
   📊 CHART.JS (NEW ADDITION)
========================= */

function updateChart() {

    let income = parseFloat(document.getElementById("totalIncome").innerText || 0);
    let expense = parseFloat(document.getElementById("totalExpense").innerText || 0);

    let ctx = document.getElementById("financeChart").getContext("2d");

    if (financeChart) {
        financeChart.destroy(); // prevent duplicate charts
    }

    financeChart = new Chart(ctx, {
        type: "pie",
        data: {
            labels: ["Income", "Expense"],
            datasets: [{
                data: [income, expense],
                backgroundColor: ["#2ecc71", "#e74c3c"]
            }]
        }
    });
}

/* =========================
   REFRESH ALL
========================= */

function refreshAll() {
    getExpenses();
    getIncome();
    loadDashboard();
    loadBudget();
}