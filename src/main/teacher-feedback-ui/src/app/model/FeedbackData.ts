import {TeacherData} from "./TeacherData";

export class FeedbackData {
    constructor(teacher: TeacherData, user: any, form: any, rating: any, comment: any) {
        this.teacher = teacher;
        this.user = user;
        this.form = form;
        this.rating = rating;
        this.comment = comment;
    }

    teacher: TeacherData;
    user: any;
    form: any;
    rating: any;
    comment: any;


}