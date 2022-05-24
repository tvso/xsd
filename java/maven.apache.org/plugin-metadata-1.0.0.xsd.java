// Code generated by xgen. DO NOT EDIT.

package schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlElement(required = true, name = "pluginMetadata")
public class PluginMetadata {
	protected PluginMetadata PluginMetadata;
}

// Mojos ...
public class Mojos {
	@XmlElement(required = true, name = "mojo")
	protected List<Mojo> Mojo;
}

// PluginMetadata2 is Root element of a script-based mojo's plugin metadata bindings.
public class PluginMetadata2 {
	@XmlElement(required = true, name = "mojos")
	protected Mojos Mojos;
}

// Components ...
public class Components {
	@XmlElement(required = true, name = "component")
	protected List<Component> Component;
}

// Parameters ...
public class Parameters {
	@XmlElement(required = true, name = "parameter")
	protected List<Parameter> Parameter;
}

// Mojo is Information about a sub-execution of the Maven lifecycle which should be processed.
public class Mojo {
	@XmlElement(required = true, name = "goal")
	protected String Goal;
	@XmlElement(required = true, name = "phase")
	protected String Phase;
	@XmlElement(required = true, name = "aggregator")
	protected Boolean Aggregator;
	@XmlElement(required = true, name = "requiresDependencyResolution")
	protected String RequiresDependencyResolution;
	@XmlElement(required = true, name = "requiresProject")
	protected Boolean RequiresProject;
	@XmlElement(required = true, name = "requiresReports")
	protected Boolean RequiresReports;
	@XmlElement(required = true, name = "requiresOnline")
	protected Boolean RequiresOnline;
	@XmlElement(required = true, name = "inheritByDefault")
	protected Boolean InheritByDefault;
	@XmlElement(required = true, name = "requiresDirectInvocation")
	protected Boolean RequiresDirectInvocation;
	@XmlElement(required = true, name = "execution")
	protected LifecycleExecution Execution;
	@XmlElement(required = true, name = "components")
	protected Components Components;
	@XmlElement(required = true, name = "parameters")
	protected Parameters Parameters;
	@XmlElement(required = true, name = "description")
	protected String Description;
	@XmlElement(required = true, name = "deprecated")
	protected String Deprecated;
	@XmlElement(required = true, name = "call")
	protected String Call;
}

// Parameter is A deprecation message for this mojo parameter.
public class Parameter {
	@XmlElement(required = true, name = "name")
	protected String Name;
	@XmlElement(required = true, name = "alias")
	protected String Alias;
	@XmlElement(required = true, name = "property")
	protected String Property;
	@XmlElement(required = true, name = "required")
	protected Boolean Required;
	@XmlElement(required = true, name = "readonly")
	protected Boolean Readonly;
	@XmlElement(required = true, name = "expression")
	protected String Expression;
	@XmlElement(required = true, name = "defaultValue")
	protected String DefaultValue;
	@XmlElement(required = true, name = "type")
	protected String Type;
	@XmlElement(required = true, name = "description")
	protected String Description;
	@XmlElement(required = true, name = "deprecated")
	protected String Deprecated;
}

// LifecycleExecution is A goal, not attached to a lifecycle phase, which should be executed ahead of this mojo.
public class LifecycleExecution {
	@XmlElement(required = true, name = "lifecycle")
	protected String Lifecycle;
	@XmlElement(required = true, name = "phase")
	protected String Phase;
	@XmlElement(required = true, name = "goal")
	protected String Goal;
}

// Component is The role-hint to lookup.
public class Component {
	@XmlElement(required = true, name = "role")
	protected String Role;
	@XmlElement(required = true, name = "hint")
	protected String Hint;
}
