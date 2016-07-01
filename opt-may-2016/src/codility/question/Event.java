package codility.question;

public class Event {

	public enum EventType {
		 A, SPECIAL_EVENT_TYPE_B, C;
	}

	private EventType type;

	public Event(EventType repository) {
		super();
		this.type = repository;
	}

	@Override
	public String toString() {
		return "Event [type=" + type + "]";
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}


}
