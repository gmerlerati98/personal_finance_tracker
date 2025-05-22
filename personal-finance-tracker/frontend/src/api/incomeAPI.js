import axios from 'axios';

const API_URL = "http://localhost:8080/api/incomes";

export const addIncome = (income) => {
    return axios.post(API_URL, income);
};