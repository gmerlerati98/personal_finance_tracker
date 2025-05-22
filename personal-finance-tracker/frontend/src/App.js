import React from 'react';
import AddExpenseForm from './components/AddExpenseForm';
import AddIncomeForm from './components/AddIncomeForm';

function App() {
  return (
      <div className="App">
        <h1>Personal Finance Tracker</h1>
          <div style={{ marginBottom: '2rem' }}>
              <AddExpenseForm />
          </div>
          <div>
              <AddIncomeForm />
          </div>

      </div>
  );
}

export default App;
