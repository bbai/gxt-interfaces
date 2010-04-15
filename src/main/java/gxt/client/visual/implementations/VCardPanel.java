package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ICardPanel;
import com.extjs.gxt.ui.client.widget.CardPanel;

/**
 * @author eugenp
 */
public class VCardPanel extends CardPanel implements ICardPanel{
	
	public VCardPanel(){
		//
	}
	
	@Override
	public CardPanel getComponent(){
		return this;
	}
}
