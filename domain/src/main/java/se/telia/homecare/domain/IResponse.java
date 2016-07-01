package se.telia.homecare.domain;

import java.util.Objects;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public interface IResponse {

    public Object getResult ();
    public Object getError ();

}