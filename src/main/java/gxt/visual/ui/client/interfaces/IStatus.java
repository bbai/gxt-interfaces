package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Status;

import gxt.visual.ui.client.interfaces.presenter.IStatusPresenter;
import gxt.visual.ui.client.interfaces.view.IStatusView;

/**
 * @author eugenp
 */
public interface IStatus extends IBoxComponent, IStatusView, IStatusPresenter{
	
	/** mine */
	Status getComponent();

}
