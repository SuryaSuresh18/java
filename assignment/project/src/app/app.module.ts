import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { HttpClient,HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { UpdatecustomerComponent } from './updatecustomer/updatecustomer.component';
@NgModule({
  declarations: [
    AppComponent,
    CustomerListComponent,
    CreateCustomerComponent,
    UpdatecustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
