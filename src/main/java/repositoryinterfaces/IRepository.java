package repo;

public interface IRepository<TEntity> {

	/*public void save(TEntity entity);
	public void update(TEntity entity);
	public void delete(TEntity entity);
	public TEntity get(int id);
	public List<TEntity> getAll();*/
	
	public void count();
	public void modify(TEntity entity);
	public void delete(TEntity entity);
	public void add(TEntity entity);
	public void allOnPage(PagingInfo page);
	public TEntity withId(int id);
}
