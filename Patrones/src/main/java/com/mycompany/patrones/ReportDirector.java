package com.mycompany.patrones;

/**
 *
 * @author CltControl
 */
public class ReportDirector {
        private static ReportDirector instance;
    private ReportBuilder builder;
    
    private ReportDirector() {
        builder = new ReportBuilder();
    }
    
    public static synchronized ReportDirector getInstance() {
        if (instance == null) {
            instance = new ReportDirector();
        }
        return instance;
    }
    
    public Report constructReport(String title, String content) {
        return builder.setTitle(title)
                      .setContent(content)
                      .build();
    }
    
}
