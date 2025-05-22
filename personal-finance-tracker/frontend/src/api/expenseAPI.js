import axios from 'axios';

const API_URL = "http://localhost:8080/api/expenses";

export const addExpense = (expense) => {
    return axios.post(API_URL, expense);
};
