using System;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Mvc;

namespace AcademiaCodigo.Web.Models
{
    public class CreateProductModel
    {
        [Required]
        [MinLength(5)]
        [MaxLength(5)]
        public string Code { get; set; }

        [Required]
        public string Name { get; set; }

        public string Description { get; set; }

        [Required]
        public decimal Price { get; set; }

        public Guid Version{ get; set; }

        public string CreatedBy{ get; set; }

        public DateTimeOffset CreatedOn{ get; set; }

        public String UpdatedBy{ get; set; }

        public DateTimeOffset UpdatedOn{ get; set; }


    }
}