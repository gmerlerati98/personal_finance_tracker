import React, { useState } from 'react';
import { addIncome } from '../api/incomeAPI';

const AddIncomeForm = () => {
    const [form, setForm] = useState({
        source: '',
        amount: '',
        date: ''
    });

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        addIncome(form).then(() => {
            alert("Income added!");
            setForm({ source: '', amount:'', date: '' });
        });
    };

    return (
        <form onSubmit={handleSubmit}>
            <input name="souce" placeholder="Title" value={form.source} onChange={handleChange} />
            <input name="amount" type="number" placeholder="Amount" value={form.amount} onChange={handleChange} />
            <input name="date" type="date" value={form.date} onChange={handleChange} />
            <button type="submit">Add Income</button>
        </form>
    );
};

export default AddIncomeForm;

