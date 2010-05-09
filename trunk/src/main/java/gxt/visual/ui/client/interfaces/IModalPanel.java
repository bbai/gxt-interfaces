package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.ModalPanel;

import gxt.visual.ui.client.interfaces.presenter.IModalPanelPresenter;
import gxt.visual.ui.client.interfaces.view.IModalPanelView;

/**
 * @author eugenp
 */
public interface IModalPanel extends IBoxComponent, IModalPanelView, IModalPanelPresenter{
	
	/** mine */
	ModalPanel getComponent();

}
