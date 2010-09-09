package com.cburch.draw.tools;

import java.util.List;

import javax.swing.Icon;

import com.cburch.draw.canvas.CanvasObject;
import com.cburch.draw.model.Drawables;
import com.cburch.draw.model.DrawAttr;
import com.cburch.draw.model.DrawingAttributeSet;
import com.cburch.logisim.data.Attribute;
import com.cburch.logisim.data.Location;
import com.cburch.logisim.util.Icons;

class PolygonTool extends PolyTool {
	private DrawingAttributeSet attrs;
	
	public PolygonTool(DrawingAttributeSet attrs) {
		this.attrs = attrs;
	}
	
	@Override
	public Icon getIcon() {
		return Icons.getIcon("drawpoly.gif");
	}
	
	@Override
	public List<Attribute<?>> getAttributes() {
		return DrawAttr.ATTRS_FILL;
	}
	
	@Override
	protected CanvasObject createShape(List<Location> locations) {
		return Drawables.createPolygon(locations, attrs);
	}
}
