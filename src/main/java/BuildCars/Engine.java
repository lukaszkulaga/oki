package BuildCars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Engine
{

	@Id
	@GeneratedValue
	private long id;

	private String type;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	
	public String toString()
	{
		return "Engine [type=" + type + "]";
	}

}
