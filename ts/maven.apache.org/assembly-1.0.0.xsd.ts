// Code generated by xgen. DO NOT EDIT.

// Assembly is Describes the assembly layout and packaging.
export type Assembly = Assembly;

// Formats ...
export class Formats {
	Format: string;
}

// ModuleSets ...
export class ModuleSets {
	ModuleSet: Array<ModuleSet>;
}

// FileSets ...
export class FileSets {
	FileSet: Array<FileSet>;
}

// Files ...
export class Files {
	File: Array<FileItem>;
}

// DependencySets ...
export class DependencySets {
	DependencySet: Array<DependencySet>;
}

// Repositories ...
export class Repositories {
	Repository: Array<Repository>;
}

// ComponentDescriptors ...
export class ComponentDescriptors {
	ComponentDescriptor: string;
}

// Assembly2 is The id of this assembly. This is a symbolic name for a
//             particular assembly of files from this project.
export class Assembly2 {
	Id: string;
	Formats: Formats;
	IncludeBaseDirectory: boolean;
	IncludeSiteDirectory: boolean;
	ModuleSets: ModuleSets;
	FileSets: FileSets;
	Files: Files;
	DependencySets: DependencySets;
	Repositories: Repositories;
	ComponentDescriptors: ComponentDescriptors;
}

// GroupVersionAlignments ...
export class GroupVersionAlignments {
	GroupVersionAlignment: Array<GroupVersionAlignment>;
}

// Includes ...
export class Includes {
	Include: string;
}

// Excludes ...
export class Excludes {
	Exclude: string;
}

// Repository is If set to true, this property will trigger the creation of repository
//             metadata which will allow the repository to be used as a functional remote
//             repository.
export class Repository {
	IncludeMetadata: boolean;
	GroupVersionAlignments: GroupVersionAlignments;
	OutputDirectory: string;
	Includes: Includes;
	Excludes: Excludes;
	FileMode: string;
	DirectoryMode: string;
}

// GroupVersionAlignment is The version you want to align this group to.
export class GroupVersionAlignment {
	Id: string;
	Version: string;
	Excludes: Excludes;
}

// DependencySet is Specifies the output directory relative to the root
//             of the root directory of the assembly. For example,
//             "log" will put the specified files in the log directory.
export class DependencySet {
	OutputFileNameMapping: string;
	Unpack: boolean;
	Scope: string;
	OutputDirectory: string;
	Includes: Includes;
	Excludes: Excludes;
	FileMode: string;
	DirectoryMode: string;
}

// ModuleSet is 1.0.0
export class ModuleSet {
	Includes: Includes;
	Excludes: Excludes;
	Sources: ModuleSources;
	Binaries: ModuleBinaries;
}

// ModuleSources is Specifies the output directory relative to the root
//             of the root directory of the assembly. For example,
//             "log" will put the specified files in the log directory.
export class ModuleSources {
	OutputDirectory: string;
	Includes: Includes;
	Excludes: Excludes;
	FileMode: string;
	DirectoryMode: string;
}

// ModuleBinaries is Specifies the output directory relative to the root
//             of the root directory of the assembly. For example,
//             "log" will put the specified files in the log directory.
export class ModuleBinaries {
	IncludeDependencies: boolean;
	Unpack: boolean;
	OutputFileNameMapping: string;
	OutputDirectory: string;
	Includes: Includes;
	Excludes: Excludes;
	FileMode: string;
	DirectoryMode: string;
}

// FileItem is Flag used to determine if the file is filtered.
export class FileItem {
	Source: string;
	OutputDirectory: string;
	DestName: string;
	FileMode: string;
	LineEnding: string;
	Filtered: boolean;
}

// FileSet is Specifies the output directory relative to the root
//             of the root directory of the assembly. For example,
//             "log" will put the specified files in the log directory.
export class FileSet {
	Directory: string;
	LineEnding: string;
	OutputDirectory: string;
	Includes: Includes;
	Excludes: Excludes;
	FileMode: string;
	DirectoryMode: string;
}
