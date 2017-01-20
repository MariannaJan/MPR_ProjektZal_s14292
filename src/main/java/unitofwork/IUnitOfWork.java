package unitofwork;

import java.sql.Connection;
import domain.Entity;

public interface IUnitOfWork {

	public void saveChanges();
	public void undo();

	public void markAsNew(Entity entity, IUnitOfWorkRepository repo);
	public void markAsDeleted(Entity entity, IUnitOfWorkRepository repo);
	public void markAsChanged(Entity entity, IUnitOfWorkRepository repo);
	
	public void setConnection(Connection connection);
}

