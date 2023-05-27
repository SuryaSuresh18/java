import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import { Customer } from './customer';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private baseURL = "http://localhost:8080/api/v1/customers";
  constructor(private httpClient:HttpClient) { }
  getCustomerList():Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(`${this.baseURL}`);
  }
  createCustomer(customer: Customer): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,customer);
  }

  updateCustomer(id:number,customer: Customer):Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`,customer);
  }
  getCustomerById(id:number): Observable<Customer>{
    return this.httpClient.get<Customer>(`${this.baseURL}/${id}`);
  }
}
