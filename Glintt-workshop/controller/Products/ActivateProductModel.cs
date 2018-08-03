using System;
using System.ComponentModel.DataAnnotations;

namespace Glintt_workshop.controller.products {
    public class ActivateProductModel {
        [Required]
        public Guid Version { get; set; }

    }
}