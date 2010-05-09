package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Status;

import gxt.visual.interfaces.presenter.IStatusPresenter;
import gxt.visual.interfaces.view.IStatusView;

/**
 * @author eugenp
 */
public interface IStatus extends IBoxComponent, IStatusView, IStatusPresenter{
	
	/** mine */
	Status getComponent();

}
