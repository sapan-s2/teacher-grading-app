import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {

  private apiUrl = '/api/feedbacks/submit'; // Replace with your actual API URL

  constructor(private httpClient: HttpClient) { }

  submitFeedback(feedbackData: any): Observable<any> {
    // Set headers if needed (e.g., content type, authorization)
    const headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });

    return this.httpClient.post<any>(this.apiUrl, feedbackData, { headers });
  }
}
