package com.example.manage.page;

import com.example.manage.page.student.Top_StudentPage;
import com.example.manage.page.teacher.Top_TeacherPage;
import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.wicketstuff.annotation.mount.MountPath;

//　ログインページ（最初のページ）
@WicketHomePage
@MountPath("Login")
public class LoginPage extends WebPage {

    // コメント文いれてみた
    // 20220304 22:15
    //　コメント追記（荒関・椎原）

    public LoginPage() {

        var toTopTeacharLink = new BookmarkablePageLink<>("toTopTeachar", Top_TeacherPage.class);
        add(toTopTeacharLink);
        var toTopStudentLink = new BookmarkablePageLink<>("toTopStudent", Top_StudentPage.class);
        add(toTopStudentLink);

    }

}
