package ru.tsu.dnevnik.webgui.servlets;

import com.vaadin.annotations.Widgetset;

@Widgetset("ru.tsu.dnevnik.webgui.AppWidgetSet")
public class ServletSettings {

    //TODO установить productionMode=true для релиза
    public final static boolean PRODUCTION_MODE = false;

    public final static String
            WIDGETSET = "ru.tsu.dnevnik.webgui.AppWidgetSet",
            SERVLET_NAME_MAIN = "dnevnik/",
            PATH_MAIN = "/" + SERVLET_NAME_MAIN + "*",
            PATH_VAADIN = "/VAADIN/*";
}
