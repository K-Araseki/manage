package com.example.manage.page.teacher;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.wicketstuff.annotation.mount.MountPath;


// 講師用のトップページ
@MountPath("Top_Teacher")
public class Top_TeacherPage extends WebPage {

    public Top_TeacherPage(){

        var toClassListLink = new BookmarkablePageLink<>("toClassList", ClassListPage.class);
        add(toClassListLink);

    }

}
