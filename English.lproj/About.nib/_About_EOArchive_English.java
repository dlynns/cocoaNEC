// _About_EOArchive_English.java
// Generated by EnterpriseObjects palette at Tuesday, August 28, 2007 10:09:48 AM US/Pacific

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _About_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    AboutView _nsCustomView0, _nsCustomView1;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOImageView _nsImageView0;
    com.webobjects.eointerface.swing.EOTextField _nsTextField0, _nsTextField1, _nsTextField2, _nsTextField3, _nsTextField4;
    com.webobjects.eointerface.swing.EOView _nsBox0, _nsBox1;
    javax.swing.JPanel _nsView0;

    public _About_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsTextField4 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField111111");
        _nsImageView0 = (com.webobjects.eointerface.swing.EOImageView)_registered(new com.webobjects.eointerface.swing.EOImageView(), "");
        _nsTextField3 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2");
        _nsTextField2 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField11");
        _nsTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField");
        _nsBox1 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSView");
        _nsBox0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSBox1");
        _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField1");
        _nsCustomView1 = (AboutView)_registered(new AboutView(), "View");
        _nsCustomView0 = (AboutView)_registered(new AboutView(), "View");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "window")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "AboutPanel...");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "window");
        }
    }

    protected void _init() {
        super._init();
        _setFontForComponent(_nsTextField4, "Verdana", 11, Font.PLAIN);
        _nsTextField4.setEditable(false);
        _nsTextField4.setOpaque(false);
        _nsTextField4.setText("cocoaNEC 2.0 uses the public domain nec2c.rxq code as its compute engine.\n\nnec2c.rxq is the work of Jeroen Vreeken, PE1RXQ, and is based on the earlier nec2c program by Neoklis Kyriazis, 5B4AZ.\n\nnec2c was translated from the original NEC-2 program that was developed by Jerry Burke and A. J. Poggio of the Lawrence Livermore Labs.\n\ncocoaNEC would not have been possible without their contributions.\n\n\n");
        _nsTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField4.setSelectable(false);
        _nsTextField4.setEnabled(true);
        _nsTextField4.setBorder(null);
        _setFontForComponent(_nsImageView0, "Verdana", 11, Font.PLAIN);
        _setFontForComponent(_nsTextField3, "Verdana", 14, Font.PLAIN);
        _nsTextField3.setEditable(false);
        _nsTextField3.setOpaque(false);
        _nsTextField3.setText("cocoaNEC 2.0");
        _nsTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _nsTextField3.setSelectable(false);
        _nsTextField3.setEnabled(true);
        _nsTextField3.setBorder(null);
        _setFontForComponent(_nsTextField2, "Verdana", 11, Font.PLAIN);
        _nsTextField2.setEditable(false);
        _nsTextField2.setOpaque(false);
        _nsTextField2.setText("w7ay@arrl.net");
        _nsTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _nsTextField2.setSelectable(false);
        _nsTextField2.setEnabled(true);
        _nsTextField2.setBorder(null);
        _connect(_nsCustomView0, _nsTextField1, "versionString");
        _connect(_nsCustomView1, _nsTextField1, "versionString");
        _setFontForComponent(_nsTextField1, "Verdana", 11, Font.PLAIN);
        _nsTextField1.setEditable(false);
        _nsTextField1.setOpaque(false);
        _nsTextField1.setText("Version 0.1");
        _nsTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _nsTextField1.setSelectable(true);
        _nsTextField1.setEnabled(true);
        _nsTextField1.setBorder(null);
        if (!(_nsBox0.getLayout() instanceof EOViewLayout)) { _nsBox0.setLayout(new EOViewLayout()); }
        _nsBox1.setSize(125, 1);
        _nsBox1.setLocation(2, 2);
        ((EOViewLayout)_nsBox0.getLayout()).setAutosizingMask(_nsBox1, EOViewLayout.MinYMargin);
        _nsBox0.add(_nsBox1);
        _nsBox0.setBorder(new com.webobjects.eointerface.swing._EODefaultBorder("", true, "Verdana", 13, Font.PLAIN));
        _setFontForComponent(_nsTextField0, "Verdana", 11, Font.PLAIN);
        _nsTextField0.setEditable(false);
        _nsTextField0.setOpaque(false);
        _nsTextField0.setText("Kok Chen, W7AY");
        _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _nsTextField0.setSelectable(false);
        _nsTextField0.setEnabled(true);
        _nsTextField0.setBorder(null);
        if (!(_nsCustomView1.getLayout() instanceof EOViewLayout)) { _nsCustomView1.setLayout(new EOViewLayout()); }
        _nsTextField0.setSize(129, 17);
        _nsTextField0.setLocation(152, 110);
        ((EOViewLayout)_nsCustomView1.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.MinYMargin);
        _nsCustomView1.add(_nsTextField0);
        _nsBox0.setSize(346, 5);
        _nsBox0.setLocation(47, 178);
        ((EOViewLayout)_nsCustomView1.getLayout()).setAutosizingMask(_nsBox0, EOViewLayout.MinYMargin);
        _nsCustomView1.add(_nsBox0);
        _nsTextField1.setSize(91, 22);
        _nsTextField1.setLocation(197, 69);
        ((EOViewLayout)_nsCustomView1.getLayout()).setAutosizingMask(_nsTextField1, EOViewLayout.MinYMargin);
        _nsCustomView1.add(_nsTextField1);
        _nsTextField2.setSize(129, 17);
        _nsTextField2.setLocation(152, 135);
        ((EOViewLayout)_nsCustomView1.getLayout()).setAutosizingMask(_nsTextField2, EOViewLayout.MinYMargin);
        _nsCustomView1.add(_nsTextField2);
        _nsTextField3.setSize(154, 27);
        _nsTextField3.setLocation(166, 38);
        ((EOViewLayout)_nsCustomView1.getLayout()).setAutosizingMask(_nsTextField3, EOViewLayout.MinYMargin);
        _nsCustomView1.add(_nsTextField3);
        _nsImageView0.setSize(64, 64);
        _nsImageView0.setLocation(111, 27);
        ((EOViewLayout)_nsCustomView1.getLayout()).setAutosizingMask(_nsImageView0, EOViewLayout.MinYMargin);
        _nsCustomView1.add(_nsImageView0);
        _nsTextField4.setSize(346, 231);
        _nsTextField4.setLocation(50, 204);
        ((EOViewLayout)_nsCustomView1.getLayout()).setAutosizingMask(_nsTextField4, EOViewLayout.MinYMargin);
        _nsCustomView1.add(_nsTextField4);
        if (!(_nsCustomView0.getLayout() instanceof EOViewLayout)) { _nsCustomView0.setLayout(new EOViewLayout()); }
        _nsCustomView1.setSize(463, 600);
        _nsCustomView1.setLocation(-10, -10);
        ((EOViewLayout)_nsCustomView0.getLayout()).setAutosizingMask(_nsCustomView1, EOViewLayout.MinYMargin);
        _nsCustomView0.add(_nsCustomView1);
        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsCustomView0.setSize(459, 600);
        _nsCustomView0.setLocation(-8, -6);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsCustomView0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsCustomView0);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(411, 436);
            _eoFrame0.setTitle("");
            _eoFrame0.setLocation(-711, 527);
            _eoFrame0.setSize(411, 436);
        }
    }
}
