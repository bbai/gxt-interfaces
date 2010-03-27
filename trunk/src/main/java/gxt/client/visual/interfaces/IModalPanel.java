package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.BoxComponent;

import gxt.client.visual.interfaces.presenter.IModalPanelPresenter;
import gxt.client.visual.interfaces.view.IModalPanelView;

/**
 * @author eugenp
 */
public interface IModalPanel extends IBoxComponent, IModalPanelView, IModalPanelPresenter{
	
	/** mine */
	BoxComponent getComponent();

}
