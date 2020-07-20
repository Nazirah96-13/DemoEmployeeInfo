package sg.edu.rp.c346.id17032457.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> employeeList;

    public CustomAdapter(Context context, int resource, ArrayList<EmployeeInfo> objects) {
        //super - calling the parent
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        employeeList = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvSalary = rowView.findViewById(R.id.tvSalary);


        // Obtain the Android Version information based on the position
        EmployeeInfo latest = employeeList.get(position);

        //tvVersion.setText(currentVersion.getCalendar());
        tvName.setText(latest.getName());
        tvTitle.setText(latest.getTitle());
        tvSalary.setText(latest.toString());


        return rowView;
    }
}