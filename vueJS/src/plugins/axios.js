import axios from 'axios';

global.axiosInstance = axios.create({
    baseURL: 'http://localhost:8080',
    headers: {'Accept': 'application/json,text/plain,*/*'}
});
