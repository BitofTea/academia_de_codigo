using System;
using System.ComponentModel.DataAnnotations;

namespace Glintt_workshop.controller.products {
    public class DeactivateProductModel {
        [Required]
        public Guid Version { get; set; }

    }

}