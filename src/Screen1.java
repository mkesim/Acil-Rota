//Mehmet Kesimalioglu
package org.appinventor;
import com.google.runtime.HandlesEventDispatching;
import com.google.runtime.EventDispatcher;
import com.google.runtime.Form;
import com.google.runtime.Component;
import com.google.runtime.Label;
import com.google.runtime.TableArrangement;
import com.google.runtime.Button;
import com.google.runtime.LocationSensor;
import com.google.runtime.ActivityStarter;
import com.google.runtime.PhoneCall;
class Screen1 extends Form implements HandlesEventDispatching {
  private Label Label14;
  private TableArrangement TableArrangement1;
  private Button Button_VA_Hospitals;
  private Button Button_FoodBanks;
  private Button Button1Activity;
  private Button clothing;
  private Button DropinCnter;
  private Button DAV;
  private Label Label3;
  private Label Label4;
  private Button outreach;
  private Button Veteran_Services;
  private Label Label5;
  private Label Label6;
  private Label Label7;
  private Label Label8;
  private Label Label9;
  private Label Label10;
  private Label Label11;
  private Label Label12;
  private Label Label13;
  private Button Button2;
  private Button Hotline;
  private Button Button3;
  private Button Button4;
  private Label Label2;
  private Label Label15;
  private LocationSensor LocationSensor1;
  private ActivityStarter ActivityStarter1;
  private PhoneCall PhoneCall1;
  private PhoneCall PhoneCall2;
  private PhoneCall PhoneCall3;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("Nearby");
    this.Icon("nearby-512.png");
    this.Title("En Yakındaki Hizmetler");
    Label14 = new Label(this);
    TableArrangement1 = new TableArrangement(this);
    TableArrangement1.Columns(3);
    TableArrangement1.Height(-1088);
    TableArrangement1.Width(-1070);
    TableArrangement1.Rows(13);
    Button_VA_Hospitals = new Button(TableArrangement1);
    Button_VA_Hospitals.Column(0);
    Button_VA_Hospitals.Height(-1017);
    Button_VA_Hospitals.Width(0);
    Button_VA_Hospitals.Image("236-512.png");
    Button_VA_Hospitals.Row(0);
    Button_VA_Hospitals.Shape(1);
    Button_FoodBanks = new Button(TableArrangement1);
    Button_FoodBanks.Column(1);
    Button_FoodBanks.Height(-1017);
    Button_FoodBanks.Width(0);
    Button_FoodBanks.Image("Waiter-512.png");
    Button_FoodBanks.Row(0);
    Button_FoodBanks.Shape(1);
    Button1Activity = new Button(TableArrangement1);
    Button1Activity.BackgroundColor(0xFF000000);
    Button1Activity.Column(2);
    Button1Activity.Height(-1017);
    Button1Activity.Width(0);
    Button1Activity.Image("gas-station-icon--0.png");
    Button1Activity.Row(0);
    Button1Activity.Shape(1);
    clothing = new Button(TableArrangement1);
    clothing.Column(0);
    clothing.Height(-1017);
    clothing.Width(0);
    clothing.Image("build21-512.png");
    clothing.Row(2);
    clothing.Shape(1);
    DropinCnter = new Button(TableArrangement1);
    DropinCnter.Column(1);
    DropinCnter.Height(-1017);
    DropinCnter.Width(0);
    DropinCnter.Image("police_station1600.png");
    DropinCnter.Row(2);
    DropinCnter.Shape(1);
    DAV = new Button(TableArrangement1);
    DAV.Column(2);
    DAV.Height(-1017);
    DAV.Width(0);
    DAV.Image("veterinary_surgeon-512.png");
    DAV.Row(2);
    DAV.Shape(1);
    Label3 = new Label(TableArrangement1);
    Label3.Column(1);
    Label3.FontSize(12);
    Label3.Row(1);
    Label3.Text("Restoranlar");
    Label3.TextColor(0xFF888888);
    Label4 = new Label(TableArrangement1);
    Label4.Column(2);
    Label4.FontSize(12);
    Label4.Row(1);
    Label4.Text("Benzin İstasyonu");
    Label4.TextColor(0xFF888888);
    outreach = new Button(TableArrangement1);
    outreach.Column(0);
    outreach.Height(-1017);
    outreach.Width(0);
    outreach.Image("Park-512.png");
    outreach.Row(4);
    outreach.Shape(1);
    Veteran_Services = new Button(TableArrangement1);
    Veteran_Services.Column(1);
    Veteran_Services.Height(-1017);
    Veteran_Services.Width(0);
    Veteran_Services.Image("75905.png");
    Veteran_Services.Row(4);
    Veteran_Services.Shape(1);
    Label5 = new Label(TableArrangement1);
    Label5.Column(0);
    Label5.FontSize(12);
    Label5.Row(3);
    Label5.Text("AVM");
    Label5.TextColor(0xFF888888);
    Label6 = new Label(TableArrangement1);
    Label6.Column(1);
    Label6.FontSize(12);
    Label6.Row(3);
    Label6.Text("Karakol");
    Label6.TextColor(0xFF888888);
    Label7 = new Label(TableArrangement1);
    Label7.Column(2);
    Label7.FontSize(12);
    Label7.Row(3);
    Label7.Text("Veterinerler");
    Label7.TextColor(0xFF888888);
    Label8 = new Label(TableArrangement1);
    Label8.Column(2);
    Label8.FontSize(12);
    Label8.Row(5);
    Label8.Text("Eğlence Merkezi");
    Label8.TextColor(0xFF888888);
    Label9 = new Label(TableArrangement1);
    Label9.Column(1);
    Label9.FontSize(12);
    Label9.Row(5);
    Label9.Text("Otopark");
    Label9.TextColor(0xFF888888);
    Label10 = new Label(TableArrangement1);
    Label10.Column(0);
    Label10.FontSize(12);
    Label10.Row(5);
    Label10.Text("Parklar");
    Label10.TextColor(0xFF888888);
    Label11 = new Label(TableArrangement1);
    Label11.Column(0);
    Label11.Row(7);
    Label11.Text("Polis");
    Label11.TextColor(0xFF888888);
    Label12 = new Label(TableArrangement1);
    Label12.Column(1);
    Label12.Row(7);
    Label12.Text("Ambulans");
    Label12.TextColor(0xFF888888);
    Label13 = new Label(TableArrangement1);
    Label13.Column(2);
    Label13.Row(7);
    Label13.Text("İtfaiye");
    Label13.TextColor(0xFF888888);
    Button2 = new Button(TableArrangement1);
    Button2.Column(2);
    Button2.Height(-1017);
    Button2.Width(0);
    Button2.Image("fireman-512.png");
    Button2.Row(6);
    Button2.Shape(1);
    Hotline = new Button(TableArrangement1);
    Hotline.Column(0);
    Hotline.Height(-1017);
    Hotline.Width(0);
    Hotline.Image("police-icon-1.png");
    Hotline.Row(6);
    Hotline.Shape(1);
    Button3 = new Button(TableArrangement1);
    Button3.Column(2);
    Button3.Height(-1017);
    Button3.Width(0);
    Button3.Image("theater-masks-512.png");
    Button3.Row(4);
    Button3.Shape(1);
    Button4 = new Button(TableArrangement1);
    Button4.Column(1);
    Button4.Height(-1017);
    Button4.Width(0);
    Button4.Image("42-512.png");
    Button4.Row(6);
    Button4.Shape(1);
    Label2 = new Label(TableArrangement1);
    Label2.Column(0);
    Label2.FontSize(12);
    Label2.Row(1);
    Label2.Text("Hastaneler");
    Label2.TextColor(0xFF888888);
    Label15 = new Label(this);
    LocationSensor1 = new LocationSensor(this);
    LocationSensor1.DistanceInterval(1);
    LocationSensor1.TimeInterval(1000);
    ActivityStarter1 = new ActivityStarter(this);
    ActivityStarter1.Action("android.intent.action.VIEW");
    ActivityStarter1.ActivityClass("com.google.android.maps.MapsActivity");
    ActivityStarter1.ActivityPackage("com.google.android.apps.maps");
    PhoneCall1 = new PhoneCall(this);
    PhoneCall1.PhoneNumber(155);
    PhoneCall2 = new PhoneCall(this);
    PhoneCall2.PhoneNumber(112);
    PhoneCall3 = new PhoneCall(this);
    PhoneCall3.PhoneNumber(110);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
