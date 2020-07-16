using Nest.XPack;
using Nest.CommonAbstractions;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.XPack {

	public class RevertModelSnapshotResponse : IResponse {
		
		[DataMember(Name="model")]
		public ModelSnapshot Model { get; set; }

	}
}
