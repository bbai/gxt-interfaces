package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.ModalPanel;

import gxt.visual.interfaces.presenter.IModalPanelPresenter;
import gxt.visual.interfaces.view.IModalPanelView;

/**
 * @author eugenp
 */
public interface IModalPanel extends IBoxComponent, IModalPanelView, IModalPanelPresenter{
	
	/** mine */
	ModalPanel getComponent();

}
