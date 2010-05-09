package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.CardPanel;

import gxt.visual.interfaces.presenter.ICardPanelPresenter;
import gxt.visual.interfaces.view.ICardPanelView;

/**
 * @author eugenp
 */
public interface ICardPanel extends ILayoutContainer, ICardPanelView, ICardPanelPresenter{
	
	/** mine */
	CardPanel getComponent();

}
