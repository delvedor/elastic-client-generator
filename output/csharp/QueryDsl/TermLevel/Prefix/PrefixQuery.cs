using Nest.QueryDsl;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.QueryDsl {

	public class PrefixQuery  {
		
		[DataMember(Name="rewrite")]
		public MultiTermQueryRewrite Rewrite { get; set; }

	}
}
