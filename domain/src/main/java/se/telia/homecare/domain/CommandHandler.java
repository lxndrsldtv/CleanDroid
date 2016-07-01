package se.telia.homecare.domain;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public interface CommandHandler<Command> {
    void handle(Command T);
}
