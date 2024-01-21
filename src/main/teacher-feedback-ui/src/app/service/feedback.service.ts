import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import {FeedbackData} from "../model/FeedbackData";

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {

  private apiUrl = '/api/feedbacks/submit'; // Replace with your actual API URL

  constructor(private httpClient: HttpClient) { }

  submitFeedback(feedbackData: FeedbackData ) {
      return this.httpClient.post(this.apiUrl, feedbackData, );
  }
}
