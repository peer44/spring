package spring.ioc;

public class SpringAction {

	private SpringDao springDao;

	public SpringDao getSpringDao() {
		return springDao;
	}

	// 一定要写被注入对象的set方法
	public void setSpringDao(SpringDao springDao) {
		this.springDao = springDao;
	}

	public void ok() {
		springDao.ok();
	}
}
