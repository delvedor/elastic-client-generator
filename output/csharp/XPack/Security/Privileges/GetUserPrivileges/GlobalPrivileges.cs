using Nest.XPack;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.XPack {

	public class GlobalPrivileges  {
		
		[DataMember(Name="application")]
		public ApplicationGlobalUserPrivileges Application { get; set; }

	}
}
