// Copyright 2020 The xgen Authors. All rights reserved.
//
// DO NOT EDIT: generated by xgen XSD generator
//
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

export type ST_Lang = string;

export type ST_HexColorRGB = Array<any>;

export type ST_Panose = Array<any>;

export enum ST_CalendarType {
	gregorian = 'gregorian',
	gregorianUs = 'gregorianUs',
	gregorianMeFrench = 'gregorianMeFrench',
	gregorianArabic = 'gregorianArabic',
	hijri = 'hijri',
	hebrew = 'hebrew',
	taiwan = 'taiwan',
	japan = 'japan',
	thai = 'thai',
	korea = 'korea',
	saka = 'saka',
	gregorianXlitEnglish = 'gregorianXlitEnglish',
	gregorianXlitFrench = 'gregorianXlitFrench',
	none = 'none',
}

export type ST_Guid = string;

export class ST_OnOff {
	Boolean: boolean;
}

export type ST_String = string;

export type ST_XmlName = string;

export type ST_UnsignedDecimalNumber = number;

export class ST_TwipsMeasure {
	ST_UnsignedDecimalNumber: number;
	ST_PositiveUniversalMeasure: ST_PositiveUniversalMeasure;
}

export enum ST_VerticalAlignRun {
	baseline = 'baseline',
	superscript = 'superscript',
	subscript = 'subscript',
}

export type ST_Xstring = string;

export enum ST_XAlign {
	left = 'left',
	center = 'center',
	right = 'right',
	inside = 'inside',
	outside = 'outside',
}

export enum ST_YAlign {
	inline = 'inline',
	top = 'top',
	center = 'center',
	bottom = 'bottom',
	inside = 'inside',
	outside = 'outside',
}

export enum ST_ConformanceClass {
	strict = 'strict',
	transitional = 'transitional',
}

export type ST_UniversalMeasure = string;

export type ST_PositiveUniversalMeasure = string;

export type ST_Percentage = string;

export type ST_FixedPercentage = string;

export type ST_PositivePercentage = string;

export type ST_PositiveFixedPercentage = string;
