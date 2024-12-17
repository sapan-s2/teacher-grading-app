import { Component, OnInit } from '@angular/core';
import {FeedbackService} from "../service/feedback.service";
import {FeedbackData} from "../model/FeedbackData";
import {TeacherData} from "../model/TeacherData";
import {UserData} from "../model/UserData";

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {
  show: boolean = false
  feedback : FeedbackData; // Initialize with your form fields
  teacher : TeacherData; // Initialize with your form fields
  user : UserData; // Initialize with your form fields

  constructor(private feedbackService: FeedbackService) {
      this.teacher = new TeacherData("1","","","")  // modify this value if you want to insert a record
      this.user = new UserData("1");
      this.feedback = new FeedbackData(this.teacher,this.user,null,"","");
      // this.feedback.teacher.id=2; // modify this value if you want to insert a record
  }

  ngOnInit(): void {
  }

  onSubmitFeedback() {
      console.log(this.feedback);
    this.feedbackService.submitFeedback(this.feedback)
        .subscribe(
            response => {
              console.log('Feedback submitted successfully:', response);
              this.show= true
                console.log('show flag:', this.show);
              // Handle success, e.g., show a success message
            },
            error => {
              console.error('Error submitting feedback:', error);
              // Handle error, e.g., show an error message
            }
        );

  }
}
