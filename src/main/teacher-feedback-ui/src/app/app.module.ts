import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FeedbackComponent } from './feedback/feedback.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";

@NgModule({
  declarations: [
    AppComponent,
    FeedbackComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    HttpClientModule,
    RouterModule.forRoot([

      {
        path: 'feedback',
        component: FeedbackComponent
      },

    ]),
    RouterModule.forChild([

      {
        path: 'feedback',
        component: FeedbackComponent
      },
      {path: '', redirectTo: '/feedback', pathMatch: 'full'}
    ]),

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
