package com.example.manage.page.teacher;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.wicketstuff.annotation.mount.MountPath;

// 講師が授業予定を確認するページ
@MountPath("ClassList")
public class ClassListPage extends WebPage {

    public ClassListPage(){

        var toTeacherReport = new BookmarkablePageLink<>("toTeacherReport",TeacherReportPage.class);
        add(toTeacherReport);

    }

}
