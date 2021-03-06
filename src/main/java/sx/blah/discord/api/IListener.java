package sx.blah.discord.api;

/**
 * Used to represent a class that handles only one event.
 *
 * @param <T> The event type to handle.
 */
@FunctionalInterface
public interface IListener <T extends Event> {

	/**
	 * Called when the event is sent.
	 *
	 * @param event The event object.
	 */
	void handle(T event);
}
