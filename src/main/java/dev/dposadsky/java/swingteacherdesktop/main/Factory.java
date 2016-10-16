package dev.dposadsky.java.swingteacherdesktop.main;

import dev.dposadsky.java.swingteacherdesktop.dao.*;
import dev.dposadsky.java.swingteacherdesktop.dao.mock.*;
import dev.dposadsky.java.swingteacherdesktop.email.SenderTLS;
import dev.dposadsky.java.swingteacherdesktop.tables.User;

public class Factory {
    
    public static final Factory instance = new Factory();
    
    private Checker checker;
    
    private LessonDao lessonDao;
    private ShorthandDao shorthandDao;
    private TaskDao taskDao;
    private DocumentationDao documentationDao;
    private ErrorDao errorDao;
    private KeywordDao keywordDao;
    private UserDao userDao;
    private CompletedTaskDao completedTaskDao;
    
    private User currentUser;
    
    private SenderTLS senderTLS;
    
    private Factory() { }
    
    public static Factory getInstance() {
        return Factory.instance;    
    }
    
    public Checker getChecker() {
        if (checker == null) 
            checker = new Checker();
        return checker;
    }

    public LessonDao getLessonDao() {
        if (lessonDao == null) 
            lessonDao = new LessonDaoMock();
        return lessonDao;
    }
    
    public ShorthandDao getShorthandDao() {
        if (shorthandDao == null) 
            shorthandDao = new ShorthandDaoMock();
        return shorthandDao;
    }
    
    public TaskDao getTaskDao() {
        if (taskDao == null) 
            taskDao = new TaskDaoMock();
        return taskDao;
    }
    
    public DocumentationDao getDocumentationDao() {
        if (documentationDao == null) 
            documentationDao = new DocumentationDaoMock();
        return documentationDao;
    }
    
    public ErrorDao getErrorDao() {
        if (errorDao == null) 
            errorDao = new ErrorDaoMock();
        return errorDao;
    }
    
    public KeywordDao getKeywordDao() {
        if (keywordDao == null) 
            keywordDao = new KeywordDaoMock();
        return keywordDao;
    }
    
    public UserDao getUserDao() {
        if (userDao == null) 
            userDao = new UserDaoMock();
        return userDao;
    }
    
    public CompletedTaskDao getCompletedTaskDao() {
        if (completedTaskDao == null) 
            completedTaskDao = new CompletedTaskDaoMock();
        return completedTaskDao;
    }
    
    public User getCurrentUser() {
        if (currentUser == null) 
            currentUser = new User();
        return currentUser;
    }
    
    public SenderTLS getSenderTLS() {
        if (senderTLS == null) 
            senderTLS = new SenderTLS("swingteacherru@gmail.com","{ee78$@oj3X9R2");
        return senderTLS;
    }
    
}
