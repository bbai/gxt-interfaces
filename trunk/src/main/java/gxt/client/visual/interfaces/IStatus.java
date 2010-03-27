package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Status;

import gxt.client.visual.interfaces.presenter.IStatusPresenter;
import gxt.client.visual.interfaces.view.IStatusView;

/**
 * @author eugenp
 */
public interface IStatus extends IBoxComponent, IStatusView, IStatusPresenter{
	
	/** mine */
	Status getComponent();

}
