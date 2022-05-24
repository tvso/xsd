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
@XmlElement(required = true, name = "settings")
public class Settings {
	protected Settings Settings;
}

// Proxies ...
public class Proxies {
	@XmlElement(required = true, name = "proxy")
	protected List<Proxy> Proxy;
}

// Servers ...
public class Servers {
	@XmlElement(required = true, name = "server")
	protected List<Server> Server;
}

// Mirrors ...
public class Mirrors {
	@XmlElement(required = true, name = "mirror")
	protected List<Mirror> Mirror;
}

// Profiles ...
public class Profiles {
	@XmlElement(required = true, name = "profile")
	protected List<Profile> Profile;
}

// ActiveProfiles ...
public class ActiveProfiles {
	@XmlElement(required = true, name = "activeProfile")
	protected List<String> ActiveProfile;
}

// PluginGroups ...
public class PluginGroups {
	@XmlElement(required = true, name = "pluginGroup")
	protected List<String> PluginGroup;
}

// Settings2 is Indicate whether maven should operate in offline mode full-time.
public class Settings2 {
	@XmlElement(required = true, name = "localRepository")
	protected String LocalRepository;
	@XmlElement(required = true, name = "interactiveMode")
	protected Boolean InteractiveMode;
	@XmlElement(required = true, name = "usePluginRegistry")
	protected Boolean UsePluginRegistry;
	@XmlElement(required = true, name = "offline")
	protected Boolean Offline;
	@XmlElement(required = true, name = "proxies")
	protected Proxies Proxies;
	@XmlElement(required = true, name = "servers")
	protected Servers Servers;
	@XmlElement(required = true, name = "mirrors")
	protected Mirrors Mirrors;
	@XmlElement(required = true, name = "profiles")
	protected Profiles Profiles;
	@XmlElement(required = true, name = "activeProfiles")
	protected ActiveProfiles ActiveProfiles;
	@XmlElement(required = true, name = "pluginGroups")
	protected PluginGroups PluginGroups;
}

// Mirror is 1.0.0
public class Mirror {
	@XmlElement(required = true, name = "mirrorOf")
	protected String MirrorOf;
	@XmlElement(required = true, name = "name")
	protected String Name;
	@XmlElement(required = true, name = "url")
	protected String Url;
	@XmlElement(required = true, name = "id")
	protected String Id;
}

// Proxy is 1.0.0
public class Proxy {
	@XmlElement(required = true, name = "active")
	protected Boolean Active;
	@XmlElement(required = true, name = "protocol")
	protected String Protocol;
	@XmlElement(required = true, name = "username")
	protected String Username;
	@XmlElement(required = true, name = "password")
	protected String Password;
	@XmlElement(required = true, name = "port")
	protected Integer Port;
	@XmlElement(required = true, name = "host")
	protected String Host;
	@XmlElement(required = true, name = "nonProxyHosts")
	protected String NonProxyHosts;
	@XmlElement(required = true, name = "id")
	protected String Id;
}

// Configuration ...
public class Configuration {
}

// Server is The permissions for directories when they are created.
public class Server {
	@XmlElement(required = true, name = "username")
	protected String Username;
	@XmlElement(required = true, name = "password")
	protected String Password;
	@XmlElement(required = true, name = "privateKey")
	protected String PrivateKey;
	@XmlElement(required = true, name = "passphrase")
	protected String Passphrase;
	@XmlElement(required = true, name = "filePermissions")
	protected String FilePermissions;
	@XmlElement(required = true, name = "directoryPermissions")
	protected String DirectoryPermissions;
	@XmlElement(required = true, name = "configuration")
	protected Configuration Configuration;
	@XmlElement(required = true, name = "id")
	protected String Id;
}

// Properties ...
public class Properties {
}

// Repositories ...
public class Repositories {
	@XmlElement(required = true, name = "repository")
	protected List<Repository> Repository;
}

// PluginRepositories ...
public class PluginRepositories {
	@XmlElement(required = true, name = "pluginRepository")
	protected List<Repository> PluginRepository;
}

// Profile is The conditional logic which will automatically
//             trigger the inclusion of this profile.
public class Profile {
	@XmlElement(required = true, name = "activation")
	protected Activation Activation;
	@XmlElement(required = true, name = "properties")
	protected Properties Properties;
	@XmlElement(required = true, name = "repositories")
	protected Repositories Repositories;
	@XmlElement(required = true, name = "pluginRepositories")
	protected PluginRepositories PluginRepositories;
	@XmlElement(required = true, name = "id")
	protected String Id;
}

// Repository is The type of layout this repository uses for locating and
//             storing artifacts - can be "legacy" or "default".
public class Repository {
	@XmlElement(required = true, name = "releases")
	protected RepositoryPolicy Releases;
	@XmlElement(required = true, name = "snapshots")
	protected RepositoryPolicy Snapshots;
	@XmlElement(required = true, name = "id")
	protected String Id;
	@XmlElement(required = true, name = "name")
	protected String Name;
	@XmlElement(required = true, name = "url")
	protected String Url;
	@XmlElement(required = true, name = "layout")
	protected String Layout;
}

// RepositoryPolicy is What to do when verification of an artifact checksum fails -
//             warn, fail, etc. Valid values are "fail" or "warn".
public class RepositoryPolicy {
	@XmlElement(required = true, name = "enabled")
	protected Boolean Enabled;
	@XmlElement(required = true, name = "updatePolicy")
	protected String UpdatePolicy;
	@XmlElement(required = true, name = "checksumPolicy")
	protected String ChecksumPolicy;
}

// Activation is Specifies that this profile will be activated based on existence of a file.
public class Activation {
	@XmlElement(required = true, name = "activeByDefault")
	protected Boolean ActiveByDefault;
	@XmlElement(required = true, name = "jdk")
	protected String Jdk;
	@XmlElement(required = true, name = "os")
	protected ActivationOS Os;
	@XmlElement(required = true, name = "property")
	protected ActivationProperty Property;
	@XmlElement(required = true, name = "file")
	protected ActivationFile File;
}

// ActivationFile is The name of the file that should exist to activate a profile.
public class ActivationFile {
	@XmlElement(required = true, name = "missing")
	protected String Missing;
	@XmlElement(required = true, name = "exists")
	protected String Exists;
}

// ActivationOS is The version of the OS to be used to activate a profile.
public class ActivationOS {
	@XmlElement(required = true, name = "name")
	protected String Name;
	@XmlElement(required = true, name = "family")
	protected String Family;
	@XmlElement(required = true, name = "arch")
	protected String Arch;
	@XmlElement(required = true, name = "version")
	protected String Version;
}

// ActivationProperty is The value of the property to be used to activate a profile.
public class ActivationProperty {
	@XmlElement(required = true, name = "name")
	protected String Name;
	@XmlElement(required = true, name = "value")
	protected String Value;
}
