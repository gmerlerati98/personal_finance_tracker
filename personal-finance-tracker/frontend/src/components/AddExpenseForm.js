import React, { useState } from 'react';
import { addExpense } from '../api/expenseAPI';

const AddExpenseForm = () => {
    const [form, setForm] = useState({
        title: '',
        amount: '',
        category: '',
        date: ''
    });

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        addExpense(form).then(() => {
            alert("Expense added!");
            setForm({ title: '', amount: '', category: '', date: '' });
        });
    };

    return (
        <form onSubmit={handleSubmit}>
            <input name="title" placeholder="Title" value={form.title} onChange={handleChange} />
            <input name="amount" type="number" placeholder="Amount" value={form.amount} onChange={handleChange} />
            <input name="category" placeholder="Category" value={form.category} onChange={handleChange} />
            <input name="date" type="date" value={form.date} onChange={handleChange} />
            <button type="submit">Add Expense</button>
        </form>
    );
};

export default AddExpenseForm;
