import javafx.application.Application;

public class PersonServiceBean {
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    PersonDao personDao;

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonServiceBean personServiceBean =(PersonServiceBean) applicationContext.getBean("personServiceBean");

        personServiceBean.personDao.save();
    }
}
