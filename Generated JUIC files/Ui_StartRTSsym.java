/********************************************************************************
** Form generated from reading ui file 'StartRTSsym.jui'
**
** Created: Mo 7. Dez 21:27:29 2009
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_StartRTSsym implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionExit;
    public QWidget centralwidget;
    public QComboBox comboBox;
    public QCommandLinkButton commandLinkButton;
    public QCommandLinkButton commandLinkButton_2;
    public QGraphicsView graphicsView;
    public QTextBrowser textBrowser;
    public QLabel label;
    public QTextEdit textEdit;
    public QCommandLinkButton commandLinkButton_3;
    public QLabel label_2;
    public QFrame line;
    public QMenuBar menubar;
    public QMenu menuMenu;
    public QStatusBar statusbar;

    public Ui_StartRTSsym() { super(); }

    public void setupUi(QMainWindow StartRTSsym)
    {
        StartRTSsym.setObjectName("StartRTSsym");
        StartRTSsym.resize(new QSize(1024, 768).expandedTo(StartRTSsym.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding, com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding);
        sizePolicy.setHorizontalStretch((byte)7);
        sizePolicy.setVerticalStretch((byte)6);
        sizePolicy.setHeightForWidth(StartRTSsym.sizePolicy().hasHeightForWidth());
        StartRTSsym.setSizePolicy(sizePolicy);
        StartRTSsym.setMinimumSize(new QSize(1024, 768));
        StartRTSsym.setMaximumSize(new QSize(1024, 768));
        actionExit = new QAction(StartRTSsym);
        actionExit.setObjectName("actionExit");
        centralwidget = new QWidget(StartRTSsym);
        centralwidget.setObjectName("centralwidget");
        comboBox = new QComboBox(centralwidget);
        comboBox.setObjectName("comboBox");
        comboBox.setGeometry(new QRect(250, 304, 51, 22));
        commandLinkButton = new QCommandLinkButton(centralwidget);
        commandLinkButton.setObjectName("commandLinkButton");
        commandLinkButton.setGeometry(new QRect(320, 320, 111, 41));
        commandLinkButton_2 = new QCommandLinkButton(centralwidget);
        commandLinkButton_2.setObjectName("commandLinkButton_2");
        commandLinkButton_2.setGeometry(new QRect(830, 320, 81, 41));
        graphicsView = new QGraphicsView(centralwidget);
        graphicsView.setObjectName("graphicsView");
        graphicsView.setGeometry(new QRect(10, 400, 1001, 311));
        graphicsView.setStyleSheet("");
        textBrowser = new QTextBrowser(centralwidget);
        textBrowser.setObjectName("textBrowser");
        textBrowser.setGeometry(new QRect(500, 10, 521, 301));
        label = new QLabel(centralwidget);
        label.setObjectName("label");
        label.setGeometry(new QRect(10, 310, 241, 16));
        QFont font = new QFont();
        font.setFamily("Times New Roman");
        font.setPointSize(14);
        label.setFont(font);
        textEdit = new QTextEdit(centralwidget);
        textEdit.setObjectName("textEdit");
        textEdit.setGeometry(new QRect(10, 30, 481, 271));
        textEdit.setMinimumSize(new QSize(467, 271));
        textEdit.setMaximumSize(new QSize(491, 271));
        commandLinkButton_3 = new QCommandLinkButton(centralwidget);
        commandLinkButton_3.setObjectName("commandLinkButton_3");
        commandLinkButton_3.setGeometry(new QRect(540, 320, 101, 41));
        label_2 = new QLabel(centralwidget);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(10, 10, 281, 20));
        QFont font1 = new QFont();
        font1.setFamily("Times New Roman");
        font1.setPointSize(12);
        font1.setBold(true);
        font1.setWeight(75);
        label_2.setFont(font1);
        label_2.setTextFormat(com.trolltech.qt.core.Qt.TextFormat.AutoText);
        line = new QFrame(centralwidget);
        line.setObjectName("line");
        line.setGeometry(new QRect(0, 370, 1031, 20));
        line.setLineWidth(2);
        line.setFrameShape(QFrame.Shape.HLine);
        line.setFrameShadow(QFrame.Shadow.Sunken);
        StartRTSsym.setCentralWidget(centralwidget);
        menubar = new QMenuBar(StartRTSsym);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 1024, 21));
        menuMenu = new QMenu(menubar);
        menuMenu.setObjectName("menuMenu");
        StartRTSsym.setMenuBar(menubar);
        statusbar = new QStatusBar(StartRTSsym);
        statusbar.setObjectName("statusbar");
        StartRTSsym.setStatusBar(statusbar);

        menubar.addAction(menuMenu.menuAction());
        menuMenu.addAction(actionExit);
        retranslateUi(StartRTSsym);

        StartRTSsym.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow StartRTSsym)
    {
        StartRTSsym.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "MainWindow", null));
        actionExit.setText(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "Exit", null));
        comboBox.clear();
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "RM", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "DM", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "EDF", null));
        commandLinkButton.setText(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "Start", null));
        commandLinkButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "Stop", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "Select the scheduling algorithm:", null));
        commandLinkButton_3.setText(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "Next STEP", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "Input field. Please enter the tasks here.", null));
        menuMenu.setTitle(com.trolltech.qt.core.QCoreApplication.translate("StartRTSsym", "Menu", null));
    } // retranslateUi

}

