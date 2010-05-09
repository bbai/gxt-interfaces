package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.CardPanel;

import gxt.visual.ui.client.interfaces.presenter.ICardPanelPresenter;
import gxt.visual.ui.client.interfaces.view.ICardPanelView;

/**
 * @author eugenp
 */
public interface ICardPanel extends ILayoutContainer, ICardPanelView, ICardPanelPresenter{
	
	/** mine */
	CardPanel getComponent();

}
