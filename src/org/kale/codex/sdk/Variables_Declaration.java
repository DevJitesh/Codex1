package org.kale.codex.sdk;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Variables_Declaration
{
	 public int i=0;
	 double doubleArray[] = null;  
	 NumberFormat formatter = new DecimalFormat("#0.00");
	 public String folderpath,s,ExcelSavePath;
	 public long second = 1000l;
	 public long minute = 60l * second;
	 public long hour = 60l * minute;
	 public long diff;
	 public SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	 public  String currentdate = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
	 
	 public String StartTime,EndTime,Duration,ActualResultTrue,ActualResultFalse,Element,Id,ScreenShotPath,SC_ID,endtm,
	 sttm,Timestamp,TotalExecutionTime,ScDesc1,TcId1,sub_agent_name,ToolTipText_agent_draft_bkktime,ToolTipText_agent_final_bkktime,
	 ToolTipText_agent_create_bkktime,ToolTipText_ping_draft_indtime,ToolTipText_ping_final_indtime,time_agent_draft_bkktime,
	 time_agent_final_bkktime,status,Numarr1,ActualResult,Status,ExptResult,ActResult_TRUE,ActResult_FALSE,ChkType,ExpectedResult,
	 ActResult;
	 
	 
}
